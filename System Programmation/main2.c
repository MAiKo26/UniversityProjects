#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main() {
    int P[2];
    char buffer[30];

    if (pipe(P) == -1) {
        perror("Pipe creation failed");
        return 1;
    }

    int pid = fork();

    if (pid > 0) {
        close(P[0]);  // Close the read end of the pipe
        write(P[1], "abc", strlen("abc") + 1);
        close(P[1]);  // Close the write end of the pipe
    } else if (pid == 0) {
        close(P[1]);  // Close the write end of the pipe
        read(P[0], buffer, sizeof(buffer));
        printf("Received: %s\n", buffer);
        close(P[0]);  // Close the read end of the pipe
    } else {
        perror("Fork failed");
        return 1;
    }

    return 0;
}
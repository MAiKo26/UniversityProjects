#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    pid_t pid;
    int status;

    pid = fork();

    if (pid == 0) {
        printf("L'id de ce processus est %d\n", getpid());
        exit(0);
    }
    else if (pid > 0) {
        wait(&status);
        int p = WEXITSTATUS(status);
        printf("L'id du père est %d\n", getpid());
        printf("L'id du fils est %d\n", p);
    }
    else {
        printf("Erreur lors de la création du processus fils.\n");
    }

    return 0;
}

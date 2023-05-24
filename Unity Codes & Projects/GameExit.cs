using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class exit : MonoBehaviour {

	void OnTriggerEnter(Collider Other)
	{
		if(Other.CompareTag("Player2"))
		{
			SceneManager.LoadScene("gameover");
		}
	}

}


using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class changelevel : MonoBehaviour {

	void OnTriggerEnter(Collider Other)
	{
		if(Other.CompareTag("Player"))
			{
				SceneManager.LoadScene("level2");
			}
	}
}


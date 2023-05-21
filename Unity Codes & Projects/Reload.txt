using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Reload : MonoBehaviour {


	void start()
	{  StartCoroutine (test());
	}

	public void rejouer()
	{
		SceneManager.LoadScene ("menu");
	}

	IEnumerator test()
	{
		yield return new WaitForSeconds(3);
		SceneManager.LoadScene ("menu");
		Debug.Log ("NOOWWW");

	}

}


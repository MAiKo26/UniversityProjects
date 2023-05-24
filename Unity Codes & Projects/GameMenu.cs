using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
public class Jeu : MonoBehaviour {

	public void Quitter()
	{
		Application.Quit() ; 
	}

	public void Jouer()
	{
		SceneManager.LoadScene ("level1");
	}
}
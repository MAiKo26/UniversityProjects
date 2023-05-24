using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class shoot : MonoBehaviour {

	GameObject mySphereCollider;
	string myFirstString ="Hello!";
	public GameObject  PrefabProjectil;
	public int Force = 200;
	public AudioClip SdTir;
	public int ShootRate;
	public float Speed;
	//public Static Object Instantiate(Object original, Vector3 ImagePosition, Quaternion Rotation);
	private float nextFire;

	// Use this for initialization
	void Start () {

		Debug.Log ("GAME 1 ");
		
	}
	
	// Update is called once per frame
	void Update () {
		if (Time.time > nextFire) {
			GetComponent<AudioSource>().PlayOneShot (SdTir);
			nextFire = Time.time + nextFire;
		GameObject Ball= Instantiate (PrefabProjectil, transform.position, Quaternion.identity);
			Ball.GetComponent<Rigidbody>().AddForce (Vector3.right * Force);
			Destroy (Ball,3);


		}

	}
}


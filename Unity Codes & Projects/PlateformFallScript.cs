
using UnityEngine;
using System.Collections;

public class PlateformFallScript : MonoBehaviour
{

    public float SecToFall = 2;  
    private Rigidbody rb; 
    private Material plateformColor; 
    private Vector3 PositionDepart; 

    void Start ()
    {
        rb = GetComponent<Rigidbody> ();
        PositionDepart = transform.position;
        plateformColor = GetComponent<Renderer> ().material;
    }

    void OnTriggerEnter (Collider Other)
    {

        if(Other.gameObject.tag == "Player")
        {
            plateformColor.color = Color.red; 
            FallDown (); 
        }

        if(Other.gameObject.tag == "ZoneSpawn")
        {
            plateformColor.color = Color.white; 
            rb.isKinematic = true; 
            transform.position = PositionDepart;
        }
    }

    void FallDown ()
    {
        yield return new WaitForSeconds (SecToFall);
        rb.isKinematic = false;
    }

}

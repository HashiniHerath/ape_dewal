package com.example.apedeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class BuyerDashboard : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var buyerItemList: ArrayList<Buyer>

    private lateinit var sellerID: TextView

    private lateinit var auth: FirebaseAuth
    private lateinit var firebaseUser: FirebaseUser

    private var database = Firebase.firestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyer_dashboard)

        recyclerView= findViewById(R.id.buyerItems)

        auth = FirebaseAuth.getInstance()
        firebaseUser = FirebaseAuth.getInstance().currentUser!!

        sellerID = findViewById(R.id.textView17)

        val buyerID = auth.currentUser?.uid.toString()

        recyclerView.layoutManager= LinearLayoutManager(this)

        buyerItemList = arrayListOf()

        database = FirebaseFirestore.getInstance()


        database.collection("sellerItems").get()
            .addOnSuccessListener {
                for (data in it.documents){
                    val buyer:Buyer? = data.toObject(Buyer::class.java)
                    if (buyer != null) {
                        buyerItemList.add(buyer)
                    }
                }
                recyclerView.adapter =BuyerAdapter(buyerItemList,this)

                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener{
                Toast.makeText(this, it.toString() , Toast.LENGTH_SHORT).show()
            }
    }
}
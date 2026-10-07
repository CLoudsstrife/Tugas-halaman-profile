package com.example.tugashalamanprofile
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RoleActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ROLE = "extra_role"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role)

        findViewById<Button>(R.id.btnAdmin).setOnClickListener { kirimRole("Admin") }
        findViewById<Button>(R.id.btnUser).setOnClickListener { kirimRole("User") }
        findViewById<Button>(R.id.btnGuest).setOnClickListener { kirimRole("Guest") }
    }

    // Mengirim role yang dipilih ke halaman sebelumnya, lalu menutup halaman ini
    private fun kirimRole(role: String) {
        val hasil = Intent().putExtra(EXTRA_ROLE, role)
        setResult(RESULT_OK, hasil)
        finish()
    }
}
package mx.cetys.arambula.angel.micampus.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main_menu.*
import mx.cetys.arambula.angel.micampus.R.layout.activity_main_menu
import mx.cetys.arambula.angel.micampus.model.Perfil

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main_menu)

        actionBar.setDisplayHomeAsUpEnabled(true)
        val perfil = intent.getParcelableExtra<Perfil>("perfil")
        txt_logged_user.text = perfil.carrera + " " + perfil.apellido + " " + perfil.nombre
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                NavUtils.navigateUpFromSameTask(this)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

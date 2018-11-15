package com.example.corentinrobert.fifaproperso


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.corentinrobert.fifaproperso.tool.replace
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)

        replace(HomePage())
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.main, menu)
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowTitleEnabled(true)
        actionBar.setTitle("FifaProPerso")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> {
                toast("Settings selected")
                return true
            }
            R.id.citation -> {


                val citations = resources.getStringArray(R.array.citation)
                val citationAuteurs = resources.getStringArray(R.array.citationAuteur)

                val i = (Math.random() * (0 - citations.size) + citations.size).toInt()

                val builder = AlertDialog.Builder(this@MainActivity)
                builder.setTitle("Citations")
                builder.setMessage(citations[i]+" \n"+citationAuteurs[i])

                builder.setPositiveButton("Autres Citation ?"){dialog, which ->
                    val i = (Math.random() * (0 - citations.size) + citations.size).toInt()
                    builder.setMessage(citations[i]+" \n\n\t"+citationAuteurs[i])
                    builder.create().show()

                }

                builder.setNegativeButton("On arrête là"){dialog, which ->

                }

                val dialog: AlertDialog = builder.create()
                dialog.show()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.Futbin -> {
                startActivity(Intent(this,Futbin::class.java))
            }
            R.id.futhead -> {
                startActivity(Intent(this,FutHead::class.java))
            }
            R.id.appfut -> {
                startActivity(Intent(this,FutApp::class.java))
            }
            R.id.nav_photo -> {
                replace(GallerieFragment())
            }
            R.id.HomePage -> {
                replace(HomePage())
            }
            R.id.EDFs ->{
                startActivity(Intent(this,Edf::class.java))
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}

package mx.com.pruebagapsi.IU.Dashbord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import kotlinx.coroutines.runBlocking
import mx.com.pruebagapsi.IU.Complements.MyListAdapter
import mx.com.pruebagapsi.IU.Network.ResponseSearch.ResponseSearch
import mx.com.pruebagapsi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnBuscar.setOnClickListener {
            if (binding.edtBuscar.text!!.toString().equals("")){
                Toast.makeText(this@MainActivity, "Ingresa la palabra clave", Toast.LENGTH_SHORT).show()
            }else{
                EnviarInfo(binding.edtBuscar.text.toString(), 1)
            }

        }
    }

    fun EnviarInfo(toString: String, i: Int) {
        runBlocking {
            var response: ResponseSearch
            viewModel.obtenerArticulos(toString, i).let {
                response = it
                Toast.makeText(this@MainActivity, "Exito", Toast.LENGTH_SHORT).show()
                binding.list.adapter = MyListAdapter(this@MainActivity, response)
            }
        }

    }
}
package ru.alexcat.goldenring
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ru.alexcat.goldenring.databinding.ActivityBigRingBinding

class BigRing : AppCompatActivity() {
    lateinit var binding: ActivityBigRingBinding
    private val adapter = PlantAdapter()
    private val imageIdList = listOf(R.drawable.bogolubovo1,R.drawable.ivanovo1,
        R.drawable.kostroma1,R.drawable.sergeev_assad1,R.drawable.yaroslavl1,
        R.drawable.pereslavl1,R.drawable.rostov1)
    private val titleTextList = listOf("Боголюбово","Иваново","Кострома","Сергиев Пассад",
        "Ярославль","Переславль","Ростов")
    private val infoTextIdList = listOf(R.string.tv_bogolubovo,R.string.tv_ivanovo,
        R.string.tv_costroma,R.string.tv_sergeev_passad,R.string.tv_yaroslavl,
        R.string.tv_pereslavl,R.string.tv_rostov)
    private var index = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBigRingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {

            rcvBigRing.layoutManager = LinearLayoutManager(this@BigRing)
            rcvBigRing.adapter = adapter
            btnNextTown.setOnClickListener{
                if (index > 6) index =0
                val plant =Plant(imageIdList[index], titleTextList[index],infoTextIdList[index])
                adapter.addPlant(plant)
                index++
            }

        }


    }

}
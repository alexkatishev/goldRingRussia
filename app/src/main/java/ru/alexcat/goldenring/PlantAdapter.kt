package ru.alexcat.goldenring

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.alexcat.goldenring.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

    private val plantList = ArrayList<RingPlant>()

    class PlantHolder(item:View): RecyclerView.ViewHolder(item) {
       private val binding = PlantItemBinding.bind(item)
        fun bind(ringPlant: RingPlant) = with(binding){

         ivOneItem.setImageResource(ringPlant.imageId)
            tvTitleOnItem.text = ringPlant.title
            tvInfoOneItem.setText(ringPlant.info_for_image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)

            return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.bind(plantList[position])
    }

    override fun getItemCount(): Int {
       return plantList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addPlant(ringPlant: RingPlant){
        plantList.add(ringPlant)
        notifyDataSetChanged()
    }
}



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juanfra.warframeinfoapi.databinding.AlertsHolderBinding
import com.juanfra.warframeinfoapi.databinding.HolderEventosBinding
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento

class AdaptadorEventos(var listado: ArrayList<Evento>) :
    RecyclerView.Adapter<AdaptadorEventos.MiCelda>() {
    //Your holder here
    inner class MiCelda(var binding: HolderEventosBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiCelda {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HolderEventosBinding.inflate(layoutInflater, parent, false)
        return MiCelda(binding)
    }

    override fun getItemCount(): Int {
        return listado.size
    }

    override fun onBindViewHolder(holder: MiCelda, position: Int) {
        val evento = listado[position]

        with(holder.binding){
            tvTextillo.text = evento.description
        }
    }


}
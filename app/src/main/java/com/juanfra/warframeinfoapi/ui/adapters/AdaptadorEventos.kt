import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juanfra.warframeinfoapi.databinding.AlertsHolderBinding
import com.juanfra.warframeinfoapi.databinding.HolderEventosBinding
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Date

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
            tvEventTooltip.text = evento.tooltip
            val expiradoEn = Date.from(Instant.parse(evento.expiry))
            val ahora = Date.from(Instant.now())
            val diferencia = expiradoEn.time - ahora.time

            var segundos = diferencia / 1000
            var minutos = segundos / 60
            segundos %= 60
            var horas = minutos / 60
            minutos %= 60
            var dias = horas / 24
            horas %= 24
            tvEventExpiry.text = "Expira en: ${dias}d ${horas}h ${minutos}m ${segundos}s"
        }
    }


}
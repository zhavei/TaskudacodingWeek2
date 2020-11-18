package com.zhavei.taskudacodingweek2.recyceview


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zhavei.taskudacodingweek2.R

class GunungListAdapter(private val namaGunungList: List<Gunung>) : RecyclerView.Adapter<GunungListAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_item_gunung, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val gunung = namaGunungList[position]
        holder.tvMountainName.text = gunung.namaGunung
        holder.tvMontainTinggi.text = gunung.tinggiGunung
        Glide.with(holder.ivMountainImage.context)
            .load(gunung.imageUrl)
            .into(holder.ivMountainImage)
        holder.itemView.setOnClickListener { view -> gunung.namaGunung?.let { gunung.imageUrl?.let { it1 -> gunung.tinggiGunung?.let { it2 -> gunung.deskripsiGunung?.let { it3 -> goToDetailActivity(view, it, it1, it2, it3) } } } } }
    }

    private fun goToDetailActivity(view: View, namaGunung: String, imageUrl: String, tinggiGunung: String, deskripsiGunung: String) {
        val intent = Intent(view.context, DetailGunungActivity::class.java)
        intent.putExtra("namaGunung", namaGunung)
        intent.putExtra("imageurl", imageUrl)
        intent.putExtra("tinggiGunung", tinggiGunung)
        intent.putExtra("deskripsiGunung", deskripsiGunung)
        view.context.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return namaGunungList.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivMountainImage: ImageView
        var tvMountainName: TextView
        var tvMontainTinggi: TextView

        init {
            ivMountainImage = itemView.findViewById(R.id.iv_mountain_image)
            tvMountainName = itemView.findViewById(R.id.tv_nama_gunung)
            tvMontainTinggi = itemView.findViewById(R.id.tv_tinggi_gunung)
        }
    }

}
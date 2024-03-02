package com.example.akbar_atakhodhzhaev_m3_hw7

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.akbar_atakhodhzhaev_m3_hw7.databinding.PlaylistItemBinding


data class Song(val songName: String, val artist: String)
class PlaylistAdapter(private val playlist: ArrayList<Song>,
                      private val onClick: (position: Int)->Unit) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PlaylistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = playlist.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playlist[position])
        holder.itemView.setOnClickListener{
            onClick(position)
        }
    }
}

class ViewHolder(private val binding: PlaylistItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(song: Song) {
        binding.tvSongName.text = song.songName
        binding.tvArtist.text = song.artist
    }

}

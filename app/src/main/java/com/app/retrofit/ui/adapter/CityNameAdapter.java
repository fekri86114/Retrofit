package com.app.retrofit.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.retrofit.databinding.CityRowBinding;
import com.app.retrofit.model.CityModelItem;

import java.util.List;

public class CityNameAdapter extends RecyclerView.Adapter<CityNameAdapter.CityNameViewholder> {

    private final List<CityModelItem> cityModelItemList;

    public CityNameAdapter(List<CityModelItem> cityModelItemList) {
        this.cityModelItemList = cityModelItemList;
    }


    @NonNull
    @Override
    public CityNameViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityNameViewholder(CityRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityNameViewholder holder, int position) {
        CityModelItem item = cityModelItemList.get(position);
        holder.binding.textviewCityName.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return cityModelItemList.size();
    }

    static class CityNameViewholder extends RecyclerView.ViewHolder {
        private CityRowBinding binding;

        public CityNameViewholder(CityRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}

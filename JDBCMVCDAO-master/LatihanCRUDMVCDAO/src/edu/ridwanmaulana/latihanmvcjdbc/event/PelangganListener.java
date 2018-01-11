/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ridwanmaulana.latihanmvcjdbc.event;

import edu.ridwanmaulana.latihanmvcjdbc.entity.Pelanggan;
import edu.ridwanmaulana.latihanmvcjdbc.model.PelangganModel;

/**
 *  Ridwan Maulana  - 10116515
 *  PBO-12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}

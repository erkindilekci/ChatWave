package com.erkindilekci.chatwave.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.erkindilekci.chatwave.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(name = name, address = address)
}

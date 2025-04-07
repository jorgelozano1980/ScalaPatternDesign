package com.meza.lozano.jorge.patterns.modular.adapter.sistemaAudio

class AdaptadorUSB_A_Jack(auricularesUSB: AuricularesUSB) extends Auriculares3_5mm {
  override def conectarJack(): Unit = {
    println("🎚️ Adaptador USB a Jack en uso...")
    auricularesUSB.conectarUSB()
  }
}

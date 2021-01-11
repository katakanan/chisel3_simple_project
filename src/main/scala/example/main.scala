package example

import chisel3._
import chisel3.stage._

class main extends Module{
    val io = IO(new Bundle{
        val A = Input(UInt(1.W))
        val B = Input(UInt(1.W))
        val C = Output(UInt(1.W))
    })

    io.C := io.A & io.B
}

object mainDriver extends App {
    // chisel3.Driver.execute(args, () => new main)
    val verilogString = (new chisel3.stage.ChiselStage).emitVerilog(new main)
    println(verilogString)
}
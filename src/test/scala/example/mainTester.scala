package example

import org.scalatest._
import chiseltest._
import chisel3._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class mainTester extends AnyFlatSpec with ChiselScalatestTester with Matchers {
    it should "test: and circuit" in {
        test(new main){c => 
            c.io.A.poke(0.U)
            c.io.B.poke(0.U)
            c.clock.step()
            c.io.C.expect(0.U)

            c.io.A.poke(1.U)
            c.io.B.poke(0.U)
            c.clock.step()
            c.io.C.expect(0.U)

            c.io.A.poke(0.U)
            c.io.B.poke(1.U)
            c.clock.step()
            c.io.C.expect(0.U)

            c.io.A.poke(1.U)
            c.io.B.poke(1.U)
            c.clock.step()
            c.io.C.expect(1.U)
        }
    }
}
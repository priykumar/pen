package casestudies.pen.pens;

import casestudies.pen.Refil;

public class GelPen extends Pen{
    private Refil refil;

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}

package ModelElements;

import Staff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> Textures) {
        this.Textures = Textures;
        List<Point3D> Res = new ArrayList<>();
        Poligons.add(new Poligon());
    }


}

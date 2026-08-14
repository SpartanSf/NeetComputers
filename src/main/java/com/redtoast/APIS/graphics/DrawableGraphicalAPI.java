package com.redtoast.APIS.graphics;

import com.redtoast.graphics.RGBGraphicsArray;
import com.redtoast.simulation.Runtime;
import com.redtoast.simulation.annotations.Exposed;
import org.joml.Vector2i;

public class DrawableGraphicalAPI extends GraphicalAPI {
    private final RGBGraphicsArray graphics;

    public DrawableGraphicalAPI(RGBGraphicsArray graphics, Runtime runtime) {
        super(graphics.getSize().x, graphics.getSize().y, runtime);
        this.graphics = graphics;
    }

    @Exposed
    public void draw()
    {
        copyTo(graphics);
    }
}

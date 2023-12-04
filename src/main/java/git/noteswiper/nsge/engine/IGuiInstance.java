/*
 * Copyright (c) 2023. All right reserved.
 */

package git.noteswiper.nsge.engine;

import git.noteswiper.nsge.engine.scene.Scene;

public interface IGuiInstance {
    void drawGui();

    boolean handleGuiInput(Scene scene, Window window);
}

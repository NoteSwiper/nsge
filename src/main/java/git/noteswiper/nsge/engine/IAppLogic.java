/*
 * Copyright (c) 2023. All right reserved.
 */

package git.noteswiper.nsge.engine;

import git.noteswiper.nsge.engine.graph.Render;
import git.noteswiper.nsge.engine.scene.Scene;

public interface IAppLogic {
    void cleanup();

    void init(Window window, Scene scene, Render render);

    void input(Window window, Scene scene, long diffTimeMillis, boolean inputConsumed);

    void update(Window window, Scene scene, long diffTimeMillis);
}

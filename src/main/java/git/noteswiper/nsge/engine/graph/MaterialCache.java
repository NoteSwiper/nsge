/*
 * Copyright (c) 2023. All right reserved.
 */

package git.noteswiper.nsge.engine.graph;

import java.util.ArrayList;
import java.util.List;

public class MaterialCache {

    public static final int DEFAULT_MATERIAL_IDX = 0;

    private List<Material> materialsList;

    public MaterialCache() {
        materialsList = new ArrayList<>();
        Material defaultMaterial = new Material();
        materialsList.add(defaultMaterial);
    }

    public void addMaterial(Material material) {
        materialsList.add(material);
        material.setMaterialIdx(materialsList.size() - 1);
    }

    public Material getMaterial(int idx) {
        return materialsList.get(idx);
    }

    public List<Material> getMaterialsList() {
        return materialsList;
    }
}

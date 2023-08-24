package com.protomaps.basemap.layers;

import static com.onthegomap.planetiler.TestUtils.newPolygon;

import com.onthegomap.planetiler.reader.SimpleFeature;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class BuildingsTest extends LayerTest {
  @Test
  void simple() {
    assertFeatures(15,
      List.of(Map.of("height", 10.0)),
      process(SimpleFeature.create(
        newPolygon(0, 0, 0, 1, 1, 1, 0, 0),
        new HashMap<>(Map.of(
          "building", "yes",
          "height", 10
        )),
        "osm",
        null,
        0
      )));
  }
}
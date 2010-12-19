package com.jimplush.goose.images;

import org.jsoup.nodes.Element;

import java.util.ArrayList;

/**
 * User: jim
 * Date: 12/19/10
 */
public interface ImageExtractor {

  /**
   * pick the best image you can find
   * @return
   */
  public String getBestImage();

  /**
   * return all the image candidates we think we have
   * @return
   */
  public ArrayList<Element> getAllImages();

}

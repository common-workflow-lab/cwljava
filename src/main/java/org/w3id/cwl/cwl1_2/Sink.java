package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#Sink</I><BR>
 */
public interface Sink extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#source</I><BR>
   * <BLOCKQUOTE>
   * Specifies one or more workflow parameters that will provide input to
   * the underlying step parameter.
   *    * </BLOCKQUOTE>
   */

  Object getSource();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Sink/linkMerge</I><BR>
   * <BLOCKQUOTE>
   * The method to use to merge multiple inbound links into a single array.
   * If not specified, the default method is "merge_nested".
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<LinkMergeMethod> getLinkMerge();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Sink/pickValue</I><BR>
   * <BLOCKQUOTE>
   * The method to use to choose non-null elements among multiple sources.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<PickValueMethod> getPickValue();
}

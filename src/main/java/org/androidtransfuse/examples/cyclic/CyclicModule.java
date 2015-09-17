package org.androidtransfuse.examples.cyclic;

import org.androidtransfuse.annotations.Bind;
import org.androidtransfuse.annotations.TransfuseModule;

/**
 * @author John Ericksen
 */
@TransfuseModule
@Bind(type=ComplexObject.class, to=ComplexObjectImpl.class)
public class CyclicModule {
}

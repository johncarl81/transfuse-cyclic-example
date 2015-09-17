package org.androidtransfuse.examples.cyclic;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainObjectWithoutProvider {

    public final Example mExample;
    public final ComplexObject mComplexObject;

    @Inject
    public MainObjectWithoutProvider(Example example, ComplexObject complexObject) {
        mExample = example;
        mComplexObject = complexObject;
    }
}

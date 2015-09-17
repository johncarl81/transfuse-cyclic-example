package org.androidtransfuse.examples.cyclic;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

public class MainObject {

    public final Example mExample;
    public final Provider<ComplexObjectImpl> mComplexObjectProvider;

    @Inject
    public MainObject(Example example, Provider<ComplexObjectImpl> complexObjectProvider) {
        mExample = example;
        mComplexObjectProvider = complexObjectProvider;
    }
}

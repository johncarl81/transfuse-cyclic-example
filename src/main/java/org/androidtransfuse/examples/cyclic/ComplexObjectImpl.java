package org.androidtransfuse.examples.cyclic;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class ComplexObjectImpl implements ComplexObject{

    public final Provider<MainObject> mMainObjectProvider;

    @Inject
    public ComplexObjectImpl(Provider<MainObject> mainObjectProvider) {
        mMainObjectProvider = mainObjectProvider;
    }

}
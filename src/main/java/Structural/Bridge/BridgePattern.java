package Structural.Bridge;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 *
 * Bridge pattern decouples abstraction from it's implementation.
 * so that they can change independently.
 *
 * it is mainly used to implement platform independence feature.
 *
 * Abstractor, RefinedAbstractor, Implementor, ConcreteImplementor.
 *
 * In this pattern, composition is used in abstraction's implementation
 * to hold reference of implementor.
 *
 *
 */
public class BridgePattern {

    public static void main(String[] args) {

        FileDownloaderImplementor windows = new WindowsDownloaderImplementor();
        FileDownloaderAbstraction abstraction = new FileDownloaderAbstractionImpl(windows);

        abstraction.download("path");
        abstraction.store(new Object());
    }
}

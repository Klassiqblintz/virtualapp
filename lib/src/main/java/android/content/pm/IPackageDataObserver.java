// Auto-generated stub from AIDL: lib/src/main/aidl/android/content/pm/IPackageDataObserver.aidl
package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IPackageDataObserver.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IPackageDataObserver extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IPackageDataObserver {
        private static final String DESCRIPTOR = "android.content.pm.IPackageDataObserver";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IPackageDataObserver asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IPackageDataObserver) {
                return (IPackageDataObserver) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                case NEEDS_DEFAULT_TRANSACTION:
                    return onTransact(code, data, reply, flags);
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IPackageDataObserver {
            private IBinder mRemote;

            public Proxy(IBinder remote) {
                mRemote = remote;
            }

            @Override
            public IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }
            package android.content.pm;
            
            /**
             * API for package data change related callbacks from the Package Manager.
             * Some usage scenarios include deletion of cache directory, generate
             * statistics related to code, data, cache usage(TODO)
             */
                void onRemoveCompleted(in String packageName, boolean succeeded);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}

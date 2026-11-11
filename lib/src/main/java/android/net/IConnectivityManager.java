// Auto-generated stub from AIDL: lib/src/main/aidl/android/net/IConnectivityManager.aidl
package android.net;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IConnectivityManager.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IConnectivityManager extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IConnectivityManager {
        private static final String DESCRIPTOR = "android.net.IConnectivityManager";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IConnectivityManager asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IConnectivityManager) {
                return (IConnectivityManager) iface;
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

        public static class Proxy implements IConnectivityManager {
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
            package android.net;
            
            
            
                NetworkInfo getActiveNetworkInfo();
                NetworkInfo getActiveNetworkInfoForUid(int uid, boolean ignoreBlocked);
            
                NetworkInfo getNetworkInfo(int networkType);
                NetworkInfo[] getAllNetworkInfo();
                boolean isActiveNetworkMetered();
                boolean requestRouteToHostAddress(int networkType, int address);
                LinkProperties getActiveLinkProperties();
                LinkProperties getLinkProperties(int networkType);
            
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}

// Auto-generated stub from AIDL: lib/src/main/aidl/android/net/wifi/IWifiScanner.aidl
package android.net.wifi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IWifiScanner.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IWifiScanner extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IWifiScanner {
        private static final String DESCRIPTOR = "android.net.wifi.IWifiScanner";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IWifiScanner asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IWifiScanner) {
                return (IWifiScanner) iface;
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

        public static class Proxy implements IWifiScanner {
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
            package android.net.wifi;
            
            
            ;
                Messenger getMessenger();
            
                Bundle getAvailableChannels(int band);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}

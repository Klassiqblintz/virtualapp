// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IPackageInstaller.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IPackageInstaller extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IPackageInstaller {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageInstaller";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IPackageInstaller asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IPackageInstaller) {
                return (IPackageInstaller) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() { return this; }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case android.os.IBinder.INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IPackageInstaller {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        
            int createSession(in SessionParams params, String installerPackageName, int userId)
        
            void updateSessionAppIcon(int sessionId, in Bitmap appIcon)
            void updateSessionAppLabel(int sessionId, String appLabel)
        
            void abandonSession(int sessionId)
        
            IPackageInstallerSession openSession(int sessionId)
        
            SessionInfo getSessionInfo(int sessionId)
        
            VParceledListSlice getAllSessions(int userId)
            VParceledListSlice getMySessions(String installerPackageName, int userId)
        
            void registerCallback(IPackageInstallerCallback callback, int userId)
            void unregisterCallback(IPackageInstallerCallback callback)
        
            void uninstall(String packageName, String callerPackageName, int flags,
                    in IntentSender statusReceiver, int userId)
        
            void setPermissionsResult(int sessionId, boolean accepted)
        
        }
    }
}

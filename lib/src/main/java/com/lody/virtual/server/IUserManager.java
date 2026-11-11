// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IUserManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IUserManager extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IUserManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IUserManager";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IUserManager asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IUserManager) {
                return (IUserManager) iface;
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

        public static class Proxy implements IUserManager {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        /**
        *
         */
            VUserInfo createUser(in String name, int flags)
            boolean removeUser(int userHandle)
            void setUserName(int userHandle, String name)
            void setUserIcon(int userHandle, in Bitmap icon)
            Bitmap getUserIcon(int userHandle)
            List<VUserInfo> getUsers(boolean excludeDying)
            VUserInfo getUserInfo(int userHandle)
            void setGuestEnabled(boolean enable)
            boolean isGuestEnabled()
            void wipeUser(int userHandle)
            int getUserSerialNumber(int userHandle)
            int getUserHandle(int userSerialNumber)
        
        }
    }
}

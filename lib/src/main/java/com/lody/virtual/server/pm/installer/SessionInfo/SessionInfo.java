// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/pm/installer/SessionInfo.aidl;
package com.lody.virtual.server.pm.installer;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for SessionInfo.;
 * Generated from AIDL for environments without an AIDL compiler.;
 */;
public interface SessionInfo extends IInterface {;
 public static abstract class Stub extends android.os.Binder implements SessionInfo {;
 private static final String DESCRIPTOR = "com.lody.virtual.server.pm.installer.SessionInfo";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static SessionInfo asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof SessionInfo) {;
 return (SessionInfo) iface;
 }
 return new Proxy(obj);
 }
;
 @Override;
 public IBinder asBinder() { return this; }
;
 @Override;
 public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {;
 switch (code) {;
 case android.os.IBinder.INTERFACE_TRANSACTION:;
 reply.writeString(DESCRIPTOR);
 return true;
 default:;
 return super.onTransact(code, data, reply, flags);
 }
 }
;
 public static class Proxy implements {classname} {{;
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 }
 }
}
;
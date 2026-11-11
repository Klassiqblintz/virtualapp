// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/interfaces/IPackageObserver.aidl;
package com.lody.virtual.server.interfaces;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for IPackageObserver.;
 * Generated from AIDL for environments without an AIDL compiler.;
 */;
public interface IPackageObserver extends IInterface {;
 public static abstract class Stub extends android.os.Binder implements IPackageObserver {;
 private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IPackageObserver";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static IPackageObserver asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageObserver) {;
 return (IPackageObserver) iface;
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
 void onPackageInstalled( String packageName);
 void onPackageUninstalled( String packageName);
 void onPackageInstalledAsUser( int userId, String packageName);
 void onPackageUninstalledAsUser( int userId, String packageName);
 }
 }
}
;
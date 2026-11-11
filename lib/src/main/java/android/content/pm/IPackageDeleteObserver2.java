// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/content/pm/IPackageDeleteObserver2.aidl
package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.content.Intent;

/**
 * Stub interface for IPackageDeleteObserver2.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IPackageDeleteObserver2.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IPackageDeleteObserver2.java {
 private static final String DESCRIPTOR = "android.content.pm.IPackageDeleteObserver2.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IPackageDeleteObserver2.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageDeleteObserver2.java) {
 return (IPackageDeleteObserver2.java) iface;
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

 public static class Proxy implements IPackageDeleteObserver2.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void onUserActionRequired( Intent intent); void onPackageDeleted(String packageName, int returnCode, String msg);
 }
 }
}
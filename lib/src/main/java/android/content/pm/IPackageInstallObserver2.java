// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/content/pm/IPackageInstallObserver2.aidl
package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.content.Intent;
import android.os.Bundle;

/**
 * Stub interface for IPackageInstallObserver2.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IPackageInstallObserver2.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IPackageInstallObserver2.java {
 private static final String DESCRIPTOR = "android.content.pm.IPackageInstallObserver2.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IPackageInstallObserver2.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageInstallObserver2.java) {
 return (IPackageInstallObserver2.java) iface;
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

 public static class Proxy implements IPackageInstallObserver2.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void onUserActionRequired( Intent intent);
 /** * The install operation has completed. {@code returnCode} holds a numeric code * indicating success or failure. In certain cases the {@code extras} Bundle will * contain additional details: * * <p><table> * <tr> * <td>INSTALL_FAILED_DUPLICATE_PERMISSION</td> * <td>Two strings are provided the extras bundle: EXTRA_EXISTING_PERMISSION * is the name of the permission that the app is attempting to define, and * EXTRA_EXISTING_PACKAGE is the package name of the app which has already * defined the permission.</td> * </tr> * </table> */ void onPackageInstalled(String basePackageName, int returnCode, String msg, Bundle extras);
 }
 }
}
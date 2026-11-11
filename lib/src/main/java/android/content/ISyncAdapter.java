// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/content/ISyncAdapter.aidl
package android.content;

import android.os.IBinder;
import android.os.IInterface;
import android.accounts.Account;
import android.os.Bundle;
import android.content.ISyncContext;

/**
 * Stub interface for ISyncAdapter.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface  extends IInterface {
 public static abstract class Stub extends android.os.Binder implements  {
 private static final String DESCRIPTOR = "android.content.";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static ISyncAdapter.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof ) {
 return (ISyncAdapter) iface;
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

 public static class Proxy implements  {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 /** * Initiate a sync for this account. SyncAdapter-specific parameters may * be specified extras, which is guaranteed to not be null. * * @param syncContext the ISyncContext used to indicate the progress of the sync. When * the sync is finished (successfully or not) ISyncContext.onFinished() must be called. * @param authority the authority that should be synced * @param account the account that should be synced * @param extras SyncAdapter-specific parameters */ void startSync(ISyncContext syncContext, String authority, Account account, Bundle extras);
 /** * Cancel the most recently initiated sync. Due to race conditions, this may arrive * after the ISyncContext.onFinished() for that sync was called. * @param syncContext the ISyncContext that was passed to {@link #startSync} */ void cancelSync(ISyncContext syncContext);
 /** * Initialize the SyncAdapter for this account and authority. * * @param account the account that should be synced * @param authority the authority that should be synced */ void initialize( Account account, String authority);
 }
 }
}
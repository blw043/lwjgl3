/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing features supported by VK_KHR_8bit_storage.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHR8bitStorage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code storageBuffer8BitAccess} &ndash; indicates whether objects in the {@code StorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StorageBuffer8BitAccess} capability.</li>
 * <li>{@code uniformAndStorageBuffer8BitAccess} &ndash; indicates whether objects in the {@code Uniform} storage class with the {@code Block} decoration and in the {@code StorageBuffer} storage class with the same decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer8BitAccess} capability.</li>
 * <li>{@code storagePushConstant8} &ndash; indicates whether objects in the {@code PushConstant} storage class <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StoragePushConstant8} capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevice8BitStorageFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 storageBuffer8BitAccess;
 *     VkBool32 uniformAndStorageBuffer8BitAccess;
 *     VkBool32 storagePushConstant8;
 * }</code></pre>
 */
public class VkPhysicalDevice8BitStorageFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER8BITACCESS,
        UNIFORMANDSTORAGEBUFFER8BITACCESS,
        STORAGEPUSHCONSTANT8;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER8BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT8 = layout.offsetof(4);
    }

    VkPhysicalDevice8BitStorageFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice8BitStorageFeaturesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code storageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() { return nstorageBuffer8BitAccess(address()) != 0; }
    /** Returns the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() { return nuniformAndStorageBuffer8BitAccess(address()) != 0; }
    /** Returns the value of the {@code storagePushConstant8} field. */
    @NativeType("VkBool32")
    public boolean storagePushConstant8() { return nstoragePushConstant8(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevice8BitStorageFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevice8BitStorageFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant8} field. */
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8(@NativeType("VkBool32") boolean value) { nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice8BitStorageFeaturesKHR set(
        int sType,
        long pNext,
        boolean storageBuffer8BitAccess,
        boolean uniformAndStorageBuffer8BitAccess,
        boolean storagePushConstant8
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice8BitStorageFeaturesKHR set(VkPhysicalDevice8BitStorageFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR create() {
        return new VkPhysicalDevice8BitStorageFeaturesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR create(long address) {
        return new VkPhysicalDevice8BitStorageFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeaturesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice8BitStorageFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #storageBuffer8BitAccess}. */
    public static int nstorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess}. */
    public static int nuniformAndStorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.UNIFORMANDSTORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant8}. */
    public static int nstoragePushConstant8(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STORAGEPUSHCONSTANT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice8BitStorageFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer8BitAccess(boolean) storageBuffer8BitAccess}. */
    public static void nstorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess(boolean) uniformAndStorageBuffer8BitAccess}. */
    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.UNIFORMANDSTORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant8(boolean) storagePushConstant8}. */
    public static void nstoragePushConstant8(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeaturesKHR.STORAGEPUSHCONSTANT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice8BitStorageFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice8BitStorageFeaturesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice8BitStorageFeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDevice8BitStorageFeaturesKHR newInstance(long address) {
            return new VkPhysicalDevice8BitStorageFeaturesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice8BitStorageFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice8BitStorageFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code storageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeaturesKHR.nstorageBuffer8BitAccess(address()) != 0; }
        /** Returns the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeaturesKHR.nuniformAndStorageBuffer8BitAccess(address()) != 0; }
        /** Returns the value of the {@code storagePushConstant8} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant8() { return VkPhysicalDevice8BitStorageFeaturesKHR.nstoragePushConstant8(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice8BitStorageFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice8BitStorageFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant8} field. */
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    }

}
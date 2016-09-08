/**
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.pulsar.common.compression;

import java.io.IOException;

import io.netty.buffer.ByteBuf;

public class CompressionCodecNone implements CompressionCodec {

    @Override
    public ByteBuf encode(ByteBuf raw) {
        // Provides an encoder that simply returns the same uncompressed buffer
        return raw.retain();
    }

    @Override
    public ByteBuf decode(ByteBuf encoded, int uncompressedSize) throws IOException {
        // No decompression is required for this codec
        return encoded.retain();
    }
}
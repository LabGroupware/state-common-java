package org.cresplanex.api.state.common.saga.local.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.cresplanex.api.state.common.constants.StorageServiceApplicationCode;
import org.cresplanex.api.state.common.saga.local.LocalException;

import java.util.List;

public class AlreadyExistFileObjectPathInBucketException extends LocalException {

    public AlreadyExistFileObjectPathInBucketException(String bucketId, List<String> paths) {
        super(
                StorageServiceApplicationCode.ALREADY_EXIST_FILE_OBJECT_PATH_IN_BUCKET,
                "Duplicated path: " + paths.stream().reduce("", (a, b) -> a + ", " + b) + " in bucket: " + bucketId,
                new Data(bucketId, paths),
                "Duplicated path: " + paths.stream().reduce("", (a, b) -> a + ", " + b) + " in bucket: " + bucketId
        );
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Data {
        private String expectedFailure = "ALREADY_EXIST_FILE_OBJECT_PATH_IN_BUCKET";
        private String bucketId;
        private List<String> paths;

        public Data(String bucketId, List<String> paths) {
            this.bucketId = bucketId;
            this.paths = paths;
        }
    }
}

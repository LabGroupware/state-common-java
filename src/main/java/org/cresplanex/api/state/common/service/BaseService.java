package org.cresplanex.api.state.common.service;

import build.buf.gen.job.v1.CreateJobRequest;
import build.buf.gen.job.v1.JobServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;

public abstract class BaseService {

    @GrpcClient("jobService")
    private JobServiceGrpc.JobServiceBlockingStub jobServiceBlockingStub;

    protected String getJobId() {
        return jobServiceBlockingStub.createJob(
                CreateJobRequest.newBuilder().build()
        ).getJobId();
    }
}

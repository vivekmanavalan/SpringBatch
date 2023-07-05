# SpringBatch

A batch process usually is a process with large amount of data, this concept is called 'Job'. Each Job is processed for a concept called 'Step'. A Step is an operation that want to run for:

    Read(Input) from file, jdbc source, etc...
    Process(Transform) define a task to realize for each row of data obtained
    Write(Output) to file, database, etc...

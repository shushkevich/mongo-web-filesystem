package ca.donlaidlaw.mongo.webfs

/**
 * Error to access specified filename.
 */
class FileAccessDeniedException extends AccessDeniedException {

    FileAccessDeniedException(String id) {
        super("User not allowed to access file with id $id")
    }
}

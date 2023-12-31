-- Place your queries here. Docs available https://www.hugsql.org/
-- :name save-message! :! :n
-- :doc creates a new message
insert into guestbook
(name, message)
values (:name, :message)

-- :name get-messages :? :*
-- :doc selects all available messages
select * from guestbook
